package org.mi.problem4;

import java.util.Scanner;

public class DigitalPont {
    public int check(int n, int d, int[][] pond){
        // 좌, 상, 우, 하
        int[] dx={-1, 0, 1, 0};
        int[] dy={0, 1, 0, -1};

        int answer = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                boolean flag = false;
                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(pond[i][j] <= d || pond[nx][ny] < pond[i][j]){
                        flag = false;
                        break;
                    }
                    flag = true;
                }
                if(flag) {
                    pond[i][j]++;
                    answer++;
                }
            }
        }
        return answer;
    }
    public void solution(int n, int[][] pond){
        int d = 0;
        while(check(n, d, pond) > 0){
            check(n, d, pond);
            d++;
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                sb.append(pond[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
    public static void main(String[] args) {
        DigitalPont T = new DigitalPont();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] pond = new int[n+2][n+2];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                pond[i][j] = sc.nextInt();
            }
        }

        T.solution(n, pond);
    }
}
