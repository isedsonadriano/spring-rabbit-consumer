package br.com.isedsonadriano.spring.consumer.amqp;

public interface AmqpConsumer<T> {

    public void consumer(T t);
}
