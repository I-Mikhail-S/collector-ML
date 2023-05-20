package org.example.autoPark;

import org.example.inkasator.Inkasator;

import java.util.List;

public class AutoPark {
    private List<Inkasator> inkasatorList;

    public AutoPark(List<Inkasator> inkasatorList) {
        this.inkasatorList = inkasatorList;
    }

    public AutoPark() {
    }

    public List<Inkasator> getInkasatorList() {
        return inkasatorList;
    }

    public void setInkasatorList(List<Inkasator> inkasatorList) {
        this.inkasatorList = inkasatorList;
    }

    @Override
    public String toString() {
        return "AutoPark{" +
                "inkasatorList=" + inkasatorList +
                '}';
    }
}
