public class CircularBuffer {
    private int bufferSize;
    private int bufferSize2 = 10;
    private String[] buffer ;
    private int readPointer;
    private int writePointer;
    //default
    public CircularBuffer() {
        this(10);
//        this.buffer = new String[bufferSize];
    }
    //overload
    public CircularBuffer(int size) {
        this.bufferSize = size;
        this.bufferSize2 = size;
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return readPointer == writePointer;
//        return bufferSize==10;
    }

    public void writeData(String input) {
        bufferSize -= 1;
        this.buffer[writePointer++]=input;
        if(writePointer == bufferSize){
            writePointer = 0;
        }
    }

    public boolean isFull() {
        return writePointer>=bufferSize;
//        return bufferSize==0;
    }

    public String readData() {
        return this.buffer[readPointer++];

    }
    public boolean isWriteMorethanBuffer() {
        if(writePointer > bufferSize2){
            return true;
        }
        return false;
    }

    public int getBufferSize() {
        return bufferSize;
    }

    public int getWritePointer() {
        return writePointer;
    }
}
