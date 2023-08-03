package solid.live.ocp;

import java.sql.Time;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
interface Resource{
    public int findFreeSlot();
    public void markSlotFree(int resourceId);
    public void markSlotBusy(int resourceId);
}
class TimeResource implements Resource{
    public int findFreeSlot() {
        return 0;
    }
    public void markSlotFree(int resourceId) {
    }
    public void markSlotBusy(int resourceId) {
    }

}
class SpaceResource implements Resource{
    public void markSlotFree(int resourceId) {
    }
    public void markSlotBusy(int resourceId) {
    }

    public int findFreeSlot() {
        return 0;
    }

}
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        int resourceId;
        resourceId = resource.findFreeSlot();
        resource.markSlotBusy(resourceId);
//        switch (resourceType) {
////            case TIME_SLOT:
////                TimeResource timeSlot = new TimeResource();
////                resourceId = timeSlot.findFreeSlot();
////                timeSlot.markSlotBusy(resourceId);
////                break;
////            case SPACE_SLOT:
////                SpaceResource spaceSlot = new SpaceResource();
////                resourceId = spaceSlot.findFreeSlot();
////                spaceSlot.markSlotBusy(resourceId);
////                break;
////            default:
////                System.out.println("ERROR: Attempted to allocate invalid resource");
////                resourceId = INVALID_RESOURCE_ID;
////                break;
//
//        }
        return resourceId;
    }

    public void free(Resource resource, int resourceId) {
        resource.markSlotFree(resourceId);
//        switch (resourceType) {
//            case TIME_SLOT:
//                TimeResource timeSlot = new TimeResource();
//                timeSlot.markSlotFree(resourceId);
//                break;
//            case SPACE_SLOT:
//                SpaceResource spaceSlot = new SpaceResource();
//                spaceSlot.markSlotFree(resourceId);
//                break;
//
//            default:
//                System.out.println("ERROR: attempted to free invalid resource");
//                break;
//        }
    }
}




