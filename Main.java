import java.util.*;


public class Main {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        int nums[]={1,1,1,2,2,3};

        System.out.println(Arrays.toString(topKFrequent(nums,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums;
        }
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int c:nums){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        Queue<Integer> queue=new PriorityQueue<>((a,b)-> hashMap.get(a)-hashMap.get(b));
        for (int n:hashMap.keySet()){
            queue.add(n);
            if(queue.size() >k){
                queue.poll();
            }
        }
        System.out.println(queue);
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=queue.poll();
        }

        System.out.println(queue);
		System.out.println("hi");
		System.out.println("hi rahul");
		

      return res;
    }
}