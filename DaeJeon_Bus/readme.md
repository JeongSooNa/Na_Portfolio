# DaeJeon Bus

- 공공데이터포털의 대전광역시 버스정보시스템을 활용한 웹 개발

### Open Api java로 받는 방법(XML)
```java
package openApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenApi {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			String urlstr = "http://openapitraffic.daejeon.go.kr/"
					+"api/rest/busposinfo/getBusPosByRtid"
					+"?busRouteId=30300001&serviceKey=MBtoNC7p5odX2BLl1DHTdu9CKQLCs4sJfAJ0B7ikIRRQ6oZ4Y%2BWbovaUFzEGZL5lkbXYMT3W8dYaveBu4wi0Iw%3D%3D";
			URL url = new URL(urlstr);
			HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
			br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));
			String result = "";
			String line;
			while((line = br.readLine()) != null) {
				result = result + line + "\n";
			}
			System.out.println(result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
```