package t33;

import java.util.List;

interface Component {
    void execute();
    List<Component> getChildren();
}