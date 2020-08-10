package Mission_0;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(){
        this.x = -1;
        this.y = -1;
    }

    private boolean isWrongValue(int value){ // 0 이하 25 이상인지 check func
        boolean wrongCase_0 = value<=0;
        boolean wrongCase_25 = value>=25;

        if (wrongCase_0||wrongCase_25){
            return true;
        }
        return false;
    }

    private void addCoord(int x, int y){ // 이상 없으면 x,y에 값 할당하는 add func
        if(!isWrongValue(x) && !isWrongValue(y)) {
            this.x = x;
            this.y = y;
        }
    }

    public void coordExtraction(String input) { // 좌표를 추출하는 함수
        new Coordinate();
        String[] coord_xy = input.split("\\(|,|\\)"); //정규 표현식으로 ( or , or )로 split
        if(coord_xy.length==3){
            boolean x_notNull = !(coord_xy[1].equals("")); //(,7) 같은 경우 x=""이 되기 때문에 검사
            boolean y_notNull = !(coord_xy[2].equals(""));

            if(x_notNull&&y_notNull){
                int coord_x = Integer.parseInt(coord_xy[1].trim());
                int coord_y = Integer.parseInt(coord_xy[2].trim());

                addCoord(coord_x, coord_y);
            }
        }
    }

    public void printXY() { // 좌표 print func
        if(x!=-1 && y!=-1){
            System.out.printf("x : %d, y : %d\n", this.x, this.y);
        }
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
