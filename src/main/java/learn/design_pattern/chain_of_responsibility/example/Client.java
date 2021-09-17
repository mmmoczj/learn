package learn.design_pattern.chain_of_responsibility.example;

import learn.design_pattern.chain_of_responsibility.example.handler.ClassAdviser;
import learn.design_pattern.chain_of_responsibility.example.handler.Dean;
import learn.design_pattern.chain_of_responsibility.example.handler.DepartmentHead;
import learn.design_pattern.chain_of_responsibility.example.handler.Leader;

public class Client {
    public static void main(String[] args) {
        Leader leader1 = new ClassAdviser();
        Leader leader2 = new DepartmentHead();
        Leader leader3 = new Dean();

        leader1.setNext(leader2);
        leader2.setNext(leader3);

        leader1.handlerRequest(3);
    }
}
