package homeWork14;


enum Priority {
    NORMAL,
    EMERGENCY
}

class Event implements Comparable<Event> {
    private final String payload;
    private final Priority priority;

    public Event(String payload, Priority priority) {
        this.payload = payload;
        this.priority = priority;
    }

    public String getPayload() {
        return payload;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Event other) {
        return other.priority.compareTo(this.priority);
    }

    @Override
    public String toString() {
        return "Event{" +
                "payload='" + payload + '\'' +
                ", priority=" + priority +
                '}';
    }
}