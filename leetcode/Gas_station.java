package leetcode;

public class Gas_station {

	public static void main(String[] args) {
		

	}
	static   int canCompleteCircuit(int[] gas, int[] cost) {
        int sumg=0,sumc=0;
        for(int i=0;i<gas.length;i++){
            sumg=sumg+gas[i];
            sumc+=cost[i];
        }
        if(sumg<sumc)return -1;
        //now the result must exit
        int total=0,res=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                res=i+1;
                total=0;
            }
        }
        return res;
    }

}
