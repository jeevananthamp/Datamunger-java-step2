package com.stackroute;

public class StudentGrade {
    public double average(int grades[]){
        double sum=0;
        for(int i=0;i<grades.length;i++)
        {
            sum=sum+grades[i];
        }
        System.out.println(sum);
        sum=sum/grades.length;
        return sum;
    }
    public int min(int grades[]){
        int min=grades[0];
        for(int i=1;i<grades.length;i++)
        {
            if(grades[i]<min)
                min=grades[i];
        }
        return min;
    }
    public int max(int grades[]){
      int max=grades[0];
        //Integer[] num;
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]>max)
                max=grades[i];
        }

       // int max = Collections.max(Arrays.asList());
        return max;
    }

}
