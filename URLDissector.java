import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.IOException;

public class URLDissector {
    public static void main(String[] args) throws IOException {
        Scanner fileScan = new Scanner(new File("urls.inp"));
        String url;
        //Scanner urlScan;
        StringTokenizer urlTokenizer;
        while(fileScan.hasNext()) {
            url = fileScan.nextLine();
            System.out.println(url);

            /*
            urlScan = new Scanner(url);
            urlScan.delimiter("/");
            while(urlScan.hasNext()) {
                System.out.println(urlScan.next());
            }
            
            */

            urlTokenizer = new StringTokenizer(url, "/", true);
            while (urlTokenizer.hasMoreTokens()){
                System.out.println(urlTokenizer.nextToken());
            }
        }
    }
}