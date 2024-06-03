package by.enumlesson.functionalinteface;

public enum RectangleEnum implements ShapeService {
    PERIMETER{//anonym class
        @Override
        public double shapeservice(double ... param) {
            return 2*(param[0]+param[1]);
        }
    },
    AREA{
    @Override
    public double shapeservice(double ... param) {
        return param[0]*param[1];
    }
    }
}
