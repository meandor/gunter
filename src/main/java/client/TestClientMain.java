package client;

import math_ops.*;
import mware_lib.NameService;
import mware_lib.ObjectBroker;

public class TestClientMain {
    public static void main(String[] args) {

        if(args.length != 2) {
            System.out.println("Usage TestClientMain <nameservice-host> <nameservice-port>");
            return;
        }
        String host = args[0];
        int port = Integer.valueOf(args[1]);

        ObjectBroker objectBroker = ObjectBroker.init(host, port, true);
        NameService nameService = objectBroker.getNameService();
        Object rawRef = nameService.resolve("zumsel");
        _CalculatorImplBase implBase = _CalculatorImplBase.narrowCast(rawRef);
        try {
            double result = implBase.add(1d, 2d);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
