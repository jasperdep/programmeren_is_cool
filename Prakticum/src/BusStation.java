import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BusStation {

    private Stack<Nameable> perron = new Stack<>();

    public void rijdtBinnen(Bus bus) {

        leegBus(bus);
        vulBus(bus);

    }

    public void leegBus(Bus bus) {

        for (String name : bus.getNames()) {

            Nameable uitgestapte = bus.uitstappen(name);
            perron.push(uitgestapte);

        }

    }

    public void vulBus(Bus bus) {

    while (!perron.isEmpty()) {

        Nameable opgestapelde = perron.pop();
        bus.instappen(opgestapelde);

    }

    }

}
