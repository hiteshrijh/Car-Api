# Car-Api
Create a simple class using native java* (no 3rd party libraries like apache commons, spring, etc) that will accept a url as an input (either via arguments or a properties file) and consume a REST endpoint (HTTP GET) and process the output.
1.       The rest endpoint will emit an array of JSON documents, each JSON document will be a complete flat (non nested) record.

2.       For each document display all of the keys of the JSON in standard out

3.       There will be a json array with the key of "numbers", sum all of the numbers and display it on standard out, add that sum to a running total for the program

4.       Display the total of the numbers that were summed for the execution

*Because java does not have a native JSON parser you can use a JSON library of your choosing (JSON.simple, GSON, Jackson, jettison, JSONP etc).

