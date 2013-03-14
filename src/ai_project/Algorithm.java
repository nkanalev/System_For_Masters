package ai_project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Vector;


public class Algorithm {
    
       
   public class Pair<L,R> 
   {
        private L l;
        private R r;
   
        public Pair(L l, R r)
        {
            this.l = l;
            this.r = r;
        }
    
        public L getL(){ return this.l; }
        public R getR(){ return this.r; }
        public void setL(L l){ this.l = l; }
        public void setR(R r){ this.r = r; }
   }
   
   public class MasterProgram
   {
       String name;
       Vector<Pair<String,Integer>> description = new Vector<Pair<String,Integer>>();
       
       public MasterProgram(String name,Vector<Pair<String,Integer>> description )
       {
           this.name = name;
           this.description = description;
       }
       
       public String getMasterProgramName()
       {
           return this.name;
       }
       public Vector<Pair<String,Integer>> getMasterProgramDescription()
       {
           return this.description;
       }
       
   }
    
   public class PathComaparator implements Comparator<Pair<String, Float>>
   {
       @Override
       public int compare(Pair<String, Float> x, Pair<String, Float> y)
        {
            if (x.getR() > y.getR())
            {
                return -1;
            }
            if (x.getR() < y.getR())
            {
                return 1;
            }
            return 0;
        }
   } 
   Comparator<Pair<String, Float>> comparator = new PathComaparator();
   PriorityQueue<Pair<String, Float>> queue = new PriorityQueue<Pair<String, Float>>(10, comparator); 
    
    public Vector <MasterProgram> createSet()
    {
        Vector <MasterProgram> vvec = new Vector <MasterProgram>();
        try{
            FileInputStream fstream = new FileInputStream("MasterProgram.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            
                
            String[] splits;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   
            {
                Vector<Pair<String,Integer>> vec = new Vector<Pair<String,Integer>>();
                splits = strLine.split(";");
                String str;
                        
                int i ;
                int size = splits.length;
                for(i = 1; i < size ; i=i+2)
                {
                   vec.add(new Pair(splits[i],Integer.parseInt(splits[i+1])));
                }
               vvec.add(new MasterProgram(splits[0],vec));
                 
               
            }
            //Close the input stream
            in.close();
        }catch (Exception e){//Catch exception if any
        System.err.println("Error: " + e.getMessage());
        
        } 
       return vvec;
    }
    
    
    public float distance (Vector<Pair<String,Integer>> mProgram, Vector<Pair<String,Integer>> myDisciplines)
    {
        float res = 0;
        int sizeOfMyDisciplines = myDisciplines.size();
        int sizemProgram = mProgram.size();
        
        int i,j;
        
        for(i = 0; i < sizeOfMyDisciplines ; i++) 
        {
            for(j = 0; j < sizemProgram ; j++)
            {
                if(myDisciplines.elementAt(i).getL().equals(mProgram.elementAt(j).getL()))
                {
                    res = res + (myDisciplines.elementAt(i).getR()*mProgram.elementAt(j).getR());
                    break;
                }   
            }
        }
        return res;
    }
    
    public Pair<String, Float> KNNAlgorithm(Vector<Pair<String, Integer>> myDisciplines)
    {
        int i;
        float dist;
        String name;
        Vector <MasterProgram> vvec = createSet();
        for(i = 0; i < vvec.size(); i++)
        {
            dist = distance(vvec.elementAt(i).getMasterProgramDescription(),myDisciplines);
            name = vvec.elementAt(i).getMasterProgramName();
            queue.add(new Pair(name,dist));
        }
        return queue.peek();
    }
}
