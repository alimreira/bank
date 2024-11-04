package com.search.ECommerceSearchRestApi.algo;


import java.util.*;

public class Priority {

    public static void main(String[] args) {
        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        que.offer(23);
        que.offer(180);
        que.offer(15);
        que.offer(55);
        que.offer(5);
        System.out.println(que);
//        for(int i =0; i<= que.size()-1; ++i){
//            System.out.print(que.poll() + " ");
//        }
        while (!que.isEmpty()) {
            System.out.print(que.poll() + " ");
        }
        System.out.println();

        List<Integer> nums = new LinkedList<>();
        nums.add(120);
        nums.add(145);
        nums.add(109);
        nums.add(250);
        nums.add(120);
        System.out.println(nums);

        Deque<String> st = new LinkedList<>();
        st.addFirst("one");
        st.add("ten");
        st.add("twelve");
        st.add("sixteen");
        st.add("eight");
        st.add("twelve");
        st.addLast("numbers");
        System.out.println(st.peekLast());
        System.out.println(st.removeLast());

        Queue<String> st1 = new LinkedList<>();
        st1.offer("twenty");
        st1.offer("thirteen");
        st1.offer("fifteen");
        st1.offer("twenty");
        st1.offer("sixty");
        System.out.println(st1.peek());
        System.out.println(st1.poll());

        Stack<String> st2 = new Stack<>();
        st2.push("further");
        st2.push("forward");
        st2.push("move");
        st2.push("match");
        st2.push("further again");
        System.out.println(st2.peek());
        System.out.println(st2.pop());

    }
}
