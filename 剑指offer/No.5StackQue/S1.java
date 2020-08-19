//我的方法
//class CQueue {
//    private Stack<Integer> que = new Stack<Integer>();
//    public CQueue() {
//
//    }
//
//    public void appendTail(int value) {
//        que.push(value);
//
//    }
//
//    public int deleteHead() {
//        if(que.empty())
//        {
//            return -1;
//        }
//        Stack<Integer> inque = new Stack<Integer>();
//        while(!que.empty())
//        {
//            int temp = que.pop();
//            inque.push(temp);
//        }
//        int ans = inque.pop();
//        while(!inque.empty())
//        {
//            int temp = inque.pop();
//            que.push(temp);
//        }
//        return ans;
//    }
//}
//
///**
// * Your CQueue object will be instantiated and called as such:
// * CQueue obj = new CQueue();
// * obj.appendTail(value);
// * int param_2 = obj.deleteHead();
// */
//优化版的方法
class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();

    }

    public void appendTail(int value) {
        stack1.push(value);

    }

    public int deleteHead() {
        if(!stack2.empty())
        {
            return stack2.pop();
        }
        else
        {
            while(!stack1.empty())
                stack2.push(stack1.pop());
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */