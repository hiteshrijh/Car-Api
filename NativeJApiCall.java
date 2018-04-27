

	import java.io.BufferedReader;
	import java.io.DataOutputStream;
	import java.io.InputStreamReader;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Map;

	import javax.net.ssl.HttpsURLConnection;

	import com.fasterxml.jackson.databind.ObjectMapper;

	public class NativeJApiCall {

		
		// HTTP GET request
		private void sendGet(String ipurl) throws Exception {
			int sum=0;
			int count=0;
			String url = ipurl;/*The rest endpoint will emit an array of JSON documents,
																		each JSON document will be a complete flat (non nested) record.*/ 
			
			URL ipurloj = new URL(url);
			HttpURLConnection setupcn = (HttpURLConnection) ipurloj.openConnection();

			
			setupcn.setRequestMethod("GET");

			BufferedReader inputStream = new BufferedReader(new InputStreamReader(setupcn.getInputStream()));
			String ip;
			StringBuffer inpJson = new StringBuffer();

			while ((ip = inputStream.readLine()) != null) {
				inpJson.append(ip);
			}
			inputStream.close();

			//print result
			System.out.println("JSON:"+inpJson.toString());
			System.out.println(" ");
			
			
			byte[] mapData= String.valueOf(inpJson).getBytes();
			

			ObjectMapper objectMapper = new ObjectMapper();
			int n=0;
			List<HashMap> dataAsMap = objectMapper.readValue(mapData, List.class);
			for(HashMap m: dataAsMap){
				n++;
				  Iterator it = m.entrySet().iterator();
				  System.out.println("***********Keys of Doucment "+n+" :");
				  while (it.hasNext()) {
					  Map.Entry pair = (Map.Entry)it.next();
				      String keyVal= (String) pair.getKey();
				      int k= Integer.parseInt(keyVal.substring(1, 2));
				      System.out.println(k);
				      sum=sum+k;
				      count ++;
				      it.remove(); 
				    }
			}
		n=0;
		System.out.println(" ");
		System.out.println("Sum of all the numbers:");
		System.out.println("Sum= "+sum);
		System.out.println(" ");
		System.out.println("Total numbers that were summed for the execution:");
		System.out.println("Count: "+count);

		}
	public static void main(String[] args) throws Exception {
			
		NativeJApiCall nj = new NativeJApiCall();
		String ipurl="http://localhost:8089/NewApp/webapi/car";
			
		nj.sendGet(ipurl);
			
			

		}
		

	}
