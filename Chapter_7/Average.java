// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Average {
    public static void main(String[] args) {
        final int[] responseTime = {100, 200, 150, 300};
        int result = calculateElement(responseTime);
        System.out.println(result);
    }
    public static int calculateElement(int[] responseTime){
        int count = 0;
        for(int i = 0; i < responseTime.length; i++){
            if(i == 0){
                continue;
            }
            else if(i == 1 && (responseTime[i] > responseTime[0] / i)){
                count++;
            }
            else if(i == 2 && (responseTime[i] > (responseTime[1] + responseTime[2]) / i)){
                count++;
            }
            else if (i == 3 &&(responseTime[i] > (responseTime[1] + responseTime[2] + responseTime[3]) / i)){
                count++;
            }
            
        }
        return count;
    }
}
