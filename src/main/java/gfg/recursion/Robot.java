package gfg.recursion;

class Robot {

    static  int canReachHelper(int  a, int  b, int  x, int  i){

        if(a == 0 && b == 0){
            if(x == i){
                return 1;
            }
            return 0;
        }


        if(i > x){
            return 0;
        }
        if(a < 0 || b<0){
            return 0;
        }




        if(canReachHelper(a+1,b,x,i+1) == 1 || canReachHelper(a-1,b,x,i+1) ==1 || canReachHelper(a,b+1,x,i+1)==1 || canReachHelper(a,b-1,x,i+1) ==1){
            return 1;
        }

        return 0;
    }

    static int canReach(int a, int b, int x) {
        // code here
        // Long i = 0;
        return canReachHelper(a,b,x, 0);

    }

    public static void main(String[] args) {
        System.out.println(canReach(10,15,25));
    }
}
