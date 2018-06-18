package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;
import org.codehaus.jackson.type.TypeReference;

import com.google.gson.Gson;

import org.codehaus.jackson.map.DeserializationConfig.Feature;

public class NetWorkCakk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloseableHttpClient httpClient = null;
        HttpGet httpPost = null;
        CloseableHttpResponse response = null;

        try {

            httpClient = HttpClients.createDefault();
            httpPost = new HttpGet("http://services.groupkt.com/country/get/iso2code/CH");

            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            nvps.add(new BasicNameValuePair("content-type", "application/json"));
            nvps.add(new BasicNameValuePair("x-kii-appid", "xxxxx"));
            nvps.add(new BasicNameValuePair("x-kii-appkey", "xxxxxxxxxxxxxx"));



            for (NameValuePair h : nvps)
            {
                httpPost.addHeader(h.getName(), h.getValue());
            }

            response = httpClient.execute(httpPost);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (response.getEntity().getContent())));

            String output;
            StringBuilder a=new StringBuilder();
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
            	a.append(output);
                System.out.println(output);
            }
            System.out.println(a.toString());
            
            
           ObjectMapper mapper = new ObjectMapper();
           Gson g=new Gson();
           String newJson =g.toJson(a.toString());
           System.out.println(newJson);
           MyPojo myPojo=g.fromJson(a.toString(), MyPojo.class);
           System.out.println("gson"+myPojo);
           System.out.println(myPojo.getRestResponse().getMessages()[0]);
           mapper.configure(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
           //MyPojo re=mapper.readValue(newJson, MyPojo.class);
          
           // System.out.println(re.getRestResponse());
            
        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try{
                response.close();
                httpClient.close();
            }catch(Exception ex) {
                ex.printStackTrace();
            }
        }

        
	}

}
