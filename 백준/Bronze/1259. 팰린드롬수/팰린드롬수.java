

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str =br.readLine();
            if (str.equals("0")) break;

            int len =str.length();
            boolean answer=true;
            //for문으로 맨 앞 맨 뒤 +-i가 같은 지 확인하면 됨
            // /2번 만큼 하면 됨
            for (int i=0;i<len/2;i++){
                if (str.charAt(i)!=str.charAt(len-1-i)) {
                    answer=false;
                    break;
                }
            }
            if (answer) System.out.println("yes");
            else System.out.println("no");
        }

    }
}
