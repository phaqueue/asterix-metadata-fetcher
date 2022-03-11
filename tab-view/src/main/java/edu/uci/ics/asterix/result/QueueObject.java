package edu.uci.ics.asterix.result;

import java.util.LinkedList;
import java.util.Queue;

public class QueueObject {
    private static Queue<Tuple> queue;

    private QueueObject() {
    }

    public static void insert(Tuple t) {
        if (queue == null)
            queue = new LinkedList<Tuple>();
        queue.add(t);
    }

    public static Boolean isEmpty() {
        if (queue == null)
            queue = new LinkedList<Tuple>();
        return queue.isEmpty();
    }

    public static Tuple remove() {
        if (queue == null)
            queue = new LinkedList<Tuple>();
        return queue.remove();
    }

    public static Queue<Tuple> getQueue() {
        if (queue == null)
            queue = new LinkedList<Tuple>();
        return queue;
    }

    public static void setQueue(Queue<Tuple> queue) {
        if (queue == null)
            queue = new LinkedList<Tuple>();
        QueueObject.queue = queue;
    }
}
