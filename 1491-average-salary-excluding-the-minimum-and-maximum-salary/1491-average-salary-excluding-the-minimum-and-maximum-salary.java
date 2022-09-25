class Solution {
    public double average(int[] salary) {
        
        int max=salary[0];
        int min=salary[0];
        
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max)
                max=salary[i];
            else if(salary[i]<min)
                min=salary[i];
        }
        
        double sum=0;
          for(int i=0;i<salary.length;i++){
              if(salary[i]==max  || salary[i]==min)
                  continue;
              else
                  sum += salary[i];
          }
        
        
        return sum/(salary.length-2);
    }
}