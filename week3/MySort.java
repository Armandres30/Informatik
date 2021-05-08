    public class MySort{

        public static void mySort(Comparable[] f){
            for(i=0;i<sizeof(f);i++){
                String min = f[0].title;
                int minindex = 0;
                for(j=i;j<sizeof(f);j++){
                    if(f[j].title < min){
                        min = f[j].title;
                        minindex = j;
                    }
                }
                f[minindex].title = f[i].title;
                f[i].title = min;
            }
    }

    }