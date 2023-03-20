package arrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class arrayList<G> {
    G arr[];


    public arrayList(){
        arr=(G[]) new Object[0];
    }
    public arrayList(int i) {
        arr=(G[]) new Object[i];
    }
   

    public arrayList<G> clone(){
       return this;
    }
    
    public int lastIndexOf(G element) {
    	int index=0;
    	boolean check=false;
    	for(int i=0;i<this.arr.length;i++ ) {
            if(arr[i].equals(element)) {
            	check=true;
                index=i;
            }
        }
    	if(check) {
    		return index;
    	}
    	else {
    		return -1;
    	}
    }

    public boolean removeAll() {
        @SuppressWarnings("unchecked")
		G[] arr1=(G[]) new Object[0];
        arr=arr1;
        return true;
    }



    public boolean equals(arrayList<G> list) {
        if(list.size()!=this.size()) {
            return false;
        }

        if(this.containAll(list)) {
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


    public boolean addAll(arrayList<G> list) {

        if(list.size()==0) {
            System.out.println("no elements found");
            return false;
        }

        G[] arr1=(G[]) new Object[arr.length+list.size()];

        System.arraycopy(arr, 0, arr1, 0, arr.length);

        for (int i=0;i < list.size(); i++) {
            arr1[i+arr.length] = list.get(i);
        }

        arr = arr1;

        return true;
    }


    @SuppressWarnings("removal")
    public G get(int val) {
//        if(arr.length<=val) {
//            return  (G) new Integer(-1);
//        }
        return arr[val];
    }
    
     public boolean set(int i,G element) {
    	arr[i]=element;
    	return true;
     }


    //add


    public boolean add(G i){

        G[] arr1 =(G[]) new Object[arr.length+1];
        System.arraycopy(arr,0,arr1,0,arr.length);
        
        arr1[arr.length]=i;
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

    public boolean containAll(arrayList<G> list) {
        for(int i=0;i<list.size();i++) {
            if(!this.contain(list.get(i))) {
                return false;
            }
        }
        return true;
    }


    public boolean remove(G val) {
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
}















