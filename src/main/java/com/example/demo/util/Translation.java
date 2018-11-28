package com.example.demo.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Translation {
	
	private static String clientId="nAZeXO94zbeMt1G8cIwM";
	private static String clientSecret="DZlqqr2Vgp";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("번역할 한국어를 입력해주세요.");
		
		String korea = scan.nextLine();
		if(korea.trim().isEmpty()) {
			System.out.println("다시 입력해주세요.");
			return;
		}
		if(korea.trim().length() >=100) {
			System.out.println("글자수는 100자를 넘을 수 없습니다.");
			return;
		}
		String regex = "^[ㄱ-ㅎ가-힣]*$";
		if(!Pattern.matches(regex, korea)) {
			System.out.println("한글만 지원합니다.");
			return;
		}
		try {
            String text = URLEncoder.encode(korea, "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            // post request
            String postParams = "source=ko&target=en&text=" + text;
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
		System.out.println("번역이 끝났습니다. 또 이용해 주세요.");
	}
}
