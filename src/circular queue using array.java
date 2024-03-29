public class queue_using_array {
    // circular queue implementation using array we just have to increase rear by the given formula i.e., rear = (rear+1)%size
    // if rear value gets equal to front then the queue is full
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] =  data;
        }
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int res = arr[front];
            // if only 1 element is present
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1)%size;
            }
            return res;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);


        while(!q.isEmpty()) {
            System.out.print(q.remove());
        }

    }
}
