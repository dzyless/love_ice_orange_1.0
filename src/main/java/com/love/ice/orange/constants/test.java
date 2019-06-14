package com.love.ice.orange.constants;

/**
 * @author zhyu.d
 * @description
 * @date 2018/10/31 17:50
 */

public class test {
    public static void main(String[] args) {
        int[] up = new int[]{50,42,9,15,105,63,14,30};
//        int res = total(188, up);
        int[] move = {2,14};
        String[] res = {"I", "*", "L", "O", "V", "E", "*", "Y", "O", "U"};
        System.out.println(pwd(move, res));
    }

    /**
     *
     * @param budget  预算上限
     * @param up  价格表
     * @return
     */
    public static int total(int budget, int[] up){

        //第一步先排序
        int temp;
        for(int i=0; i<up.length; i++){
            if(up[i] >10000){
                throw new RuntimeException("物品价格不得超过10,000元！");
            }
            for(int j=i+1; j<up.length; j++){
                if(up[i] > up[j]){
                    temp =  up[i];
                    up[i] = up[j];
                    up[j] = temp;
                }
            }
        }

        //第二部，从小到大加，不超过预算止
        int res = up[0];
        for(int i=1; i<up.length; i++){
            res+=up[i];
            if(res > budget){
                res-=up[i];
               break;
            }
        }
        return res;
    }

    /**
     *
     * @param move 输入的月份和日期
     * @param res 明文
     * @return 密码
     */
    private static final String arr[][] = {{"A", "B", "C", "D", "E", "F", "G", "H", "I"},
            {"J", "K", "L", "M", "N", "O", "P", "Q", "R"},
            {"S", "T", "U", "V", "W", "X", "Y", "Z", "*"}};
    public static String pwd(int[] move, String[] res){
        int month = move[0],
            day = move[1];
        String newArr[][] = new String[3][9];
        String tar[][] = new String[3][9];

        //分组规律
        int rem1 = 3-((month-1)%3==0?3:(month-1)%3);//第一组下标
        int rem2 = 9-((day-1)%9==0?9:(day-1)%9); //第一个字母下标
        int y = 0;

        //先重新排列每个分组里面的元素
        for(int i=0;i <9; i++){
            int x = 9-rem2+i;
            if(x<9){
                newArr[0][i] = arr[0][x];
                newArr[1][i] = arr[1][x];
                newArr[2][i] = arr[2][x];
            }else{
                newArr[0][i] = arr[0][y];
                newArr[1][i] = arr[1][y];
                newArr[2][i] = arr[2][y];
                y++;
            }
        }
        y = 0;
        for(int i=0; i<3; i++){
            int x = 3-rem1+i;
            if(x<3){
                tar[i] =newArr[x];
            }else{
                tar[i] = newArr[y];
                y++;
            }
        }

        StringBuilder str = new StringBuilder();
        for(int k=0; k<res.length; k++){
            for(int i=0; i<tar.length; i++){
                for(int j=0; j<tar[i].length; j++){
                    if(res[k] == tar[i][j]){
                        str.append(i+1).append(j+1).append(" ");
                    }
                }
            }
        }

        return str.toString();
    }


}
