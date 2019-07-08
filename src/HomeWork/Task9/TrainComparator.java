package HomeWork.Task9;

import java.util.Comparator;


public class TrainComparator implements Comparator<Train> {
   enum TrainsCompareMethods {
        BY_DIST,
        BY_NUMBER,
        BY_TIME
    }

    private TrainsCompareMethods trainsCompareMethods;

    public void setTrainsCompareMethods(TrainsCompareMethods methods) {
        trainsCompareMethods = methods;
    }

    @Override
    public int compare(Train o1, Train o2) {
        switch (trainsCompareMethods) {
            case BY_NUMBER:
                int numberDiff = Integer.compare(o1.getNumber(), o2.getNumber());
                if (numberDiff != 0) {
                    return numberDiff;
                }
                break;
            case BY_DIST:
                int destDiff = o1.getDestination().compareTo(o2.getDestination());
                if (destDiff != 0) {
                    return destDiff;
                }
                break;
            case BY_TIME:
                int timeDiff = o1.getTime().compareTo(o2.getTime());
                return timeDiff;
        }
        return o1.compareTo(o2);
    }

}
