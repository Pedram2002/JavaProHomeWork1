package homeWork14;

import java.util.PriorityQueue;
import java.util.Queue;

class SmartHomeController {
    private Queue<Event> eventQueue;

    public SmartHomeController() {
        eventQueue = new PriorityQueue<>();
    }


    public void addEvent(Event event) {
        eventQueue.offer(event);
    }

    public void startProcessing() {
        while (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            System.out.println(event);
        }
    }
}