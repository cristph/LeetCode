package problem335_Self_Crossing;

/**
 * Created by cristph on 2016/5/19.
 */


/*
* @todo
* 3 categories
* @see http://blog.csdn.net/lfx031020/article/details/50831721
* */
public class Solution {
    public boolean isSelfCrossing(int[] x) {
        Pos pos0=new Pos(0,0);
        Pos pos1=new Pos(0,0+x[0]);
        Pos pos2=new Pos(0-x[1],0+x[0]);
        Pos pos3=new Pos(0-x[1],0+x[0]-x[2]);
        Pos pos4=new Pos(0-x[1]+x[3],0+x[0]-x[2]);

        pos0.print();
        pos1.print();
        pos2.print();
        pos3.print();
        pos4.print();

        if(pos0.getY()<=pos4.getY()&&pos0.getX()<=pos4.getX()){
            return true;
        }else{
            return false;
        }
    }

    public class Pos{
        int x;
        int y;

        public Pos(int x,int y){
            this.x=x;
            this.y=y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void print(){
            System.out.println("("+x+","+y+")");
        }
    }

    public static void main(String [] args){
        Solution solution=new Solution();
        int [] x={1, 2, 3, 4};
        System.out.println(solution.isSelfCrossing(x));

        int [] x1={1, 1, 1, 1};
        System.out.println(solution.isSelfCrossing(x1));
    }
}
