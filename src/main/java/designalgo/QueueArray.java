package designalgo;

    class QueueDemo{
        private int front = -1;
        private int rear = -1;
        private int[] arr  = null;

         QueueDemo(int capacity){
            arr = new int[capacity];
        }

        void push(int v) throws Exception{
             if ((rear - front)%arr.length == arr.length-1){
                 throw new Exception("Overflow");
             }
             if(rear == -1){
                 front++;
             }
            rear++;
             arr[rear%arr.length] = v;

        }

        int poll() throws Exception{

             if(front == -1) {
                 throw new Exception("Underflow");
             }
            int r = arr[front%arr.length];
            if (rear%arr.length == front%arr.length){
                front = -1;
                rear = -1;
            }else{
             front++;
             }
            return r;
        }

        public void displayQueue()
        {
            if(front == -1)
            {
                System.out.print("Queue is Empty");
                return;
            }
            System.out.print("Elements in the " +
                    "circular queue are: ");
            int size = (rear - front)%arr.length;
            int f = front;
            while (size >=0){
                System.out.print(arr[f%arr.length]);
                System.out.print(" ");
                f++;
                size--;
            }
            System.out.println();
        }

        }

    public class QueueArray{
        public static void main(String[] args) {
            QueueDemo q = new QueueDemo(5);
            try {
//                CircularQueue q = new CircularQueue(5);

                q.push(14);
                q.push(22);
                q.push(13);
                q.push(-6);

                q.displayQueue();

                int x = q.poll();

                // Checking for empty queue.
                if(x != -1)
                {
                    System.out.print("Deleted value = ");
                    System.out.println(x);
                }

                x = q.poll();

                // Checking for empty queue.
                if(x != -1)
                {
                    System.out.print("Deleted value = ");
                    System.out.println(x);
                }

                q.displayQueue();

                q.push(9);
                q.push(20);
                q.push(5);

                q.displayQueue();

                q.push(20);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }



    }







}
