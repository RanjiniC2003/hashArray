package hashSet;
import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class hashSet <G>{
	 G arr[];
	 
	 
   public hashSet(){  
	  arr=(G[]) new Object[0];		   
   }
   public hashSet(int i) {
	   arr=(G[]) new Object[i];
   }
//   public hashSet(hashSet<G> collection) {
//	   
//   }
   
   

	   
   public static void main(String[] args) {
	   hashSet<Integer> set=new hashSet<Integer>();
//	   System.out.println(set.contain(10));
	   set.add(10);

	   set.add(10);

	   set.add(5);

	   set.add(1);
	   System.out.println(set);
	   hashSet<Integer> set1=new hashSet<Integer>();
	   set1.add(20);
	   set1.add(98);
	   set1.add(34);
	   set1.add(23);
	   
	   hashSet<Integer> set3=new hashSet<Integer>();
	   set3.add(10);
	   set3.add(28);
	   set3.add(44);
	   set3.add(53);
	   set3.add(44);
	   
	   set3.addAll(set1);
	   System.out.println("set3 "+set3);
	   
	   
//	   set.remove(1);
//	   System.out.println("set1"+set.contain(1));
//	   System.out.println("return "+set1.equals(set3));
//	   System.out.println(set3.getClass().getSimpleName());
//	   System.out.println(set3.toArray());
		
//	 System.out.println(set.indexOf(5));
//	 System.out.println(set.removeAll());
//	 System.out.println(set);
	 
//	   set.remove(1);
//	 System.out.println(set);
	 


     

	 HashSet<Integer> set10=new HashSet();
	 set10.add(1);
	 set10.add(20);
	 set10.add(2);
	 set10.add(92);
	 set10.add(98);
	 System.out.println(set10.getClass().getSimpleName());
	
	 HashSet<Integer> set2=new HashSet();
	 set10.equals(set2);
	 set10.contains(set2);
//	 System.out.println(set2.addAll(set10));
//	 set2.add(1);
//	 set2.add(20);
//	 set2.add(2);
//	 set2.add(92);
//	 set2.add(98);
	 set2.add(92);
	 set2.add(1);
	 set2.add(98);
	 set2.add(20);
	 set2.add(2);
	 
	 
	 
	 
	 
	 System.out.println(set2);
	 System.out.print("equal"+set10.equals(set2));
	 
	 
	 
	 HashSet<String> set12=new HashSet<>();
	 set12.add("1");
	 System.out.print("equal"+set10.equals(set12));
	
     
   }
   
   
  public boolean removeAll() {
	  G[] arr1=(G[]) new Object[0];
	  arr=arr1;
	  return true;
  }
  
 

  public boolean equals(hashSet<G> set1) {
	  if(set1.size()!=this.size()) {
		  return false;
	  }

	  if(this.containAll(set1)) {
		  return true;
	  }
	  else {
		  return false;
	  }
	  
  }
  
  public int indexOf(G val) {
	  System.out.println(arr.length);
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i].equals(val)) {
			  return i;
		  }
	  }
	  return -1;
  }
   
   
   public int size() {
	   return arr.length;
   }
   
   
//   public boolean addAll(hashSet<G> set) {
//
//       if(set.size()==0) {
//           System.out.println("no elements found");
//           return false;
//       }
//
//		G[] arr1=(G[]) new Object[arr.length+set.size()];
//
//       System.arraycopy(arr, 0, arr1, 0, arr.length);
//
//       for (int i=0;i < set.size(); i++) {
//           arr1[i+arr.length] = set.get(i);
//       }
//
//       arr = arr1;
//
//       return true;
//   }
//   
   
  
   public G get(int val) {
//	   if(arr.length<=val) {
//		   return  (G) new Integer(-1);
//	   }
	   return arr[val];
   }
	   
   
   //add
   
   
	public boolean add(G i){
	   if(contain(i)) {
		   return false;
	   }
		
       G[] arr1 =(G[]) new Object[arr.length+1];
       System.arraycopy(arr,0,arr1,0,arr.length);
       arr1[arr1.length-1]=i; 
	   Random r = new Random();
	   for (int i1 = 0; i1 <arr1.length-1; i1++) {
           int j = r.nextInt(i1+1);
           G temp = arr1[i1];
           arr1[i1] = arr1[j];
           arr1[j] = temp;
		 
       }
       arr=arr1;
       return true;
    }
	
	public boolean isEmpty() {
		return arr.length==0;
	}
	
	public boolean contain(G val) {

		for(G value:arr ) {
			if(value.equals(val)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containAll(hashSet<G> set) {
		for(int i=0;i<set.size();i++) {
			if(!this.contain(set.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean remove(G val) {
//		System.out.println(arr.length);
		G[] arr1=(G[]) new Object[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			if(!arr[i].equals(val)) {
				arr1[i]=arr[i];
			}
		}
		arr=arr1;
		return true;
	}
	
   
   public String toString() {
	   G[] arr1=arr;
	   return Arrays.toString(arr1);
   }
   
   public G[] toArray() {
	   G[] arr1=(G[]) new Object[this.size()];
	   for(int i=0;i<this.size();i++) {
		   arr1[i]=this.get(i);
	   }
	   arr=arr1;
	   return arr;
	  
   }

   public boolean addAll(hashSet<G> set) {

       if(set.size()==0) {
           System.out.println("no elements found");
           return false;
       }

       G[] arr1=(G[]) new Object[arr.length+set.size()];

       System.arraycopy(arr, 0, arr1, 0, arr.length);
       int k = 0;

       for (int i=0;i < set.size(); i++) {
           if (!contain(set.get(i))) {
               arr1[k+arr.length] = set.get(i);
               k += 1;
           }
       }
       
       Random r = new Random();
	   for (int i1 = 0; i1 <arr1.length-1; i1++) {
           int j = r.nextInt(i1+1);
           G temp = arr1[i1];
           arr1[i1] = arr1[j];
           arr1[j] = temp;
		 
       }
       

       arr = (G[]) new Object[arr.length+k];;
       System.arraycopy(arr1, 0, arr, 0, arr.length);

       return true;
   }
}










   