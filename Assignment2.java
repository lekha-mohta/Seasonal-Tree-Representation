import sheffield.*;

public class Assignment2 {
  public static void main (String[] args){

    //Defining EasyReader and EasyGraphics
    EasyReader file = new EasyReader("tree.txt");
    EasyGraphics tree = new EasyGraphics(600,768);

    //Initialising array
    int[][] array = new int[768][600];

    for (int i=0 ; i<128 ; i++){
      for (int j=0 ; j<120 ; j++){
        char charac = file.readChar();
        array[i][j] = Integer.valueOf(charac);
      }
    }

    //Random Number of Trees
    int min1 = 15;
    int max1 = 25;
    int range1 = max1 - min1 + 1;
    int num = (int)((Math.random()*(range1))+ min1);
    System.out.println(num);

    //Condition for Small Trees
    boolean small = (Math.random() <= 0.20);

    //First half of total Trees
    int first = (int)(0.50*num);
    //Second half of total Trees
    int rest = (int)(num-first);

    //Random values for x COORDINATES
    int min2 = 0;
    int max2 = 599;
    int range2 = max2 - min2 + 1;


    //Top Tree - Summer Tree
    //Background - PART 1
    tree.setColor (0,170,0); //GROUND
    tree.fillRectangle (0,512,600,102);

    tree.setColor(137, 215, 239); //SKY
    tree.fillRectangle (0,614,600,154);

    //Tree parts - PART 2
    //Printing First half of trees - 30% between base and horizon
    for (int i=0; i<first ; i++){
      //Randomising x coordinate
      int x = (int)((Math.random()*(range2))+min2);
      if (small){
        // 20% of all trees must be small trees
        for (int a = 127; a >= 0; a--) {
          for (int b = 119; b >= 0; b--) {
            // Printing TREE TRUNK
            if (array[a][b] % 5 == 0 && array[a][b] % 2 != 0) {
              tree.setColor(92, 22, 22);
              tree.plot(b+x, 614-a);
            }
            // Printing LEAVES
            else if (array[a][b] % 2 != 0) {
              int g = (int) (Math.random() * 255);
              tree.setColor(0, g, 0);
              tree.plot(b+x, 614-a);
            }
          }
        }
      }
      else {
        for (int a=0 ; a<=255 ; a++){
          for (int b=0; b<=239; b++){
            //Printing TREE TRUNK
            if (array[a/2][b/2]%5==0 && array[a/2][b/2]%2!=0){
              tree.setColor(92,22,22);
              tree.plot(b+x,768-a);
            }
            //Printing LEAVES
            else if (array[a/2][b/2]%2!=0){
              int g = (int)(Math.random()*255);
              tree.setColor(0,g,0);
              tree.plot(b+x,768-a);
            }
          }
        }
      }
    }

    //Printing second half of the trees - bottom of the screen
    for (int j=0 ; j<rest ; j++){
      //Randomising x coordinates
      int x = (int)((Math.random()*(range2))+min2);
      if (small){
        for (int a = 127; a >= 0; a--) {
          for (int b = 119; b >= 0; b--) {
            // TREE TRUNK
            if (array[a][b] % 5 == 0 && array[a][b] % 2 != 0) {
              tree.setColor(92, 22, 22);
              tree.plot(b+x, 768-a);
            }
            // LEAVES
            else if (array[a][b] % 2 != 0) {
              int g = (int) (Math.random() * 255);
              tree.setColor(0, g, 0);
              tree.plot(b+x, 768-a);
            }
          }
        }
      }

      else {
        for (int a=0 ; a<=255 ; a++){
          for (int b=0; b<=239; b++){
            //TREE TRUNK
            if (array[a/2][b/2]%5==0 && array[a/2][b/2]%2!=0){
              tree.setColor(92,22,22);
              tree.plot(b+x,768-a);
            }
            //LEAVES
            else if (array[a/2][b/2]%2!=0){
              int g = (int)(Math.random()*255);
              tree.setColor(0,g,0);
              tree.plot(b+x,768-a);
            }
          }
        }
      }
    }


    //Middle Tree - Autumn Tree
    //Background - Part 1
    tree.setColor (0,170,0); //GROUND
    tree.fillRectangle (0,256,600,102);

    tree.setColor(137, 215, 239); //SKY
    tree.fillRectangle (0,358,600,154);

    //Tree Parts - PART 2
    //Printing First half of trees - 30% between base and horizon
    for (int i=0; i<first ; i++){
      //Randomising x coordinate
      int x = (int)((Math.random()*(range2))+min2);
      if (small){
        // 20% of all trees must be small trees
        for (int a = 127; a >= 0; a--) {
          for (int b = 119; b >= 0; b--) {
            // Printing TREE TRUNK
            if (array[a][b] % 5 == 0 && array[a][b] % 2 != 0) {
              tree.setColor(92, 22, 22);
              tree.plot(b+x, 512-a);
            }
            // Printing LEAVES
            else if (array[a/2][b/2]%2!=0){ //LEAVES
              int g = (int)(Math.random()*255);
              int r = (int)(Math.random()*255);
              tree.setColor(r,g,0);
              tree.plot(b+x,512-a);
            }
          }
        }
      }
      else {
        for (int a=0 ; a<=255 ; a++){
          for (int b=0; b<=239; b++){
            //Printing TREE TRUNK
            if (array[a/2][b/2]%5==0 && array[a/2][b/2]%2!=0){
              tree.setColor(92,22,22);
              tree.plot(b+x,512-a);
            }
            //Printing LEAVES
            else if (array[a/2][b/2]%2!=0){ //LEAVES
              int g = (int)(Math.random()*255);
              int r = (int)(Math.random()*255);
              tree.setColor(r,g,0);
              tree.plot(b+x,512-a);
            }
          }
        }
      }
    }

    //Printing second half of the trees - bottom of the screen
    for (int j=0 ; j<rest ; j++){
      //Randomising x coordinates
      int x = (int)((Math.random()*(range2))+min2);
      if (small){
        for (int a = 127; a >= 0; a--) {
          for (int b = 119; b >= 0; b--) {
            // TREE TRUNK
            if (array[a][b] % 5 == 0 && array[a][b] % 2 != 0) {
              tree.setColor(92, 22, 22);
              tree.plot(b+x, 512-a);
            }
            // LEAVES
            else if (array[a/2][b/2]%2!=0){ //LEAVES
              int g = (int)(Math.random()*255);
              int r = (int)(Math.random()*255);
              tree.setColor(r,g,0);
              tree.plot(b+x, 512-a);
            }
          }
        }
      }

      else {
        for (int a=0 ; a<=255 ; a++){
          for (int b=0; b<=239; b++){
            //TREE TRUNK
            if (array[a/2][b/2]%5==0 && array[a/2][b/2]%2!=0){
              tree.setColor(92,22,22);
              tree.plot(b+x,512-a);
            }
            //LEAVES
            else if (array[a/2][b/2]%2!=0){ //LEAVES
              int g = (int)(Math.random()*255);
              int r = (int)(Math.random()*255);
              tree.setColor(r,g,0);
              tree.plot(b+x,512-a);
            }
          }
        }
      }
    }

    //Bottom Tree - Winter Tree
    //Background - PART 1
    //Ground
    for (int i = 0; i <= 600; i++){
      for (int j = 0; j <= 102; j++){
        //Arrays of (r,g,b) values
        int[] r = {165,210,184,110,193};
        int[] gr = {42,125,115,38,154};
        int[] bl = {42,45,51,14,107};

        //20% of the leaves should be green
        if ((Math.random() <= 0.20)){
          tree.setColor(0,170,0);
          tree.plot(i,j);
        }
        //80% of the leaves should be brown
        else {
          int red = r[(int)(Math.random()*r.length)];
          int green = gr[(int)(Math.random()*gr.length)];
          int blue = bl[(int)(Math.random()*bl.length)];
          tree.setColor(red,green,blue);
          tree.plot(i,j);
        }
      }
    }

    tree.setColor(137, 215, 239); //SKY
    tree.fillRectangle (0,102,600,154);

    //Tree parts - PART 2
    //Printing First half of trees - 30% between base and horizon
    for (int i=0; i<first ; i++){
      //Randomising x coordinate
      int x = (int)((Math.random()*(range2))+min2);
      if (small){
        // 20% of all trees must be small trees
        for (int a = 127; a >= 0; a--) {
          for (int b = 119; b >= 0; b--) {
            // Printing TREE TRUNK
            if (array[a][b] % 5 == 0 && array[a][b] % 2 != 0) {
              tree.setColor(92, 22, 22);
              tree.plot(b+x, 256-a);
            }
            // Printing LEAVES
            else if (array[a/2][b/2]%7==0 && array[a/2][b/2]%2!=0){ //BRANCHES
              int g = (int)(Math.random()*255);
              tree.setColor(92,22,22);
              tree.plot(b+x,256-a);
            }
          }
        }
      }
      else {
        for (int a=0 ; a<=255 ; a++){
          for (int b=0; b<=239; b++){
            //Printing TREE TRUNK
            if (array[a/2][b/2]%5==0 && array[a/2][b/2]%2!=0){
              tree.setColor(92,22,22);
              tree.plot(b+x,256-a);
            }
            //Printing LEAVES
            else if (array[a/2][b/2]%7==0 && array[a/2][b/2]%2!=0){ //BRANCHES
              int g = (int)(Math.random()*255);
              tree.setColor(92,22,22);
              tree.plot(b+x,256-a);
            }
          }
        }
      }
    }

    //Printing second half of the trees - bottom of the screen
    for (int j=0 ; j<rest ; j++){
      //Randomising x coordinates
      int x = (int)((Math.random()*(range2))+min2);
      if (small){
        for (int a = 127; a >= 0; a--) {
          for (int b = 119; b >= 0; b--) {
            // TREE TRUNK
            if (array[a][b] % 5 == 0 && array[a][b] % 2 != 0) {
              tree.setColor(92, 22, 22);
              tree.plot(b+x, 256-a);
            }
            // BRANCHES
            else if (array[a/2][b/2]%7==0 && array[a/2][b/2]%2!=0){
              int g = (int)(Math.random()*255);
              tree.setColor(92,22,22);
              tree.plot(b+x,256-a);
            }
          }
        }
      }

      else {
        for (int a=0 ; a<=255 ; a++){
          for (int b=0; b<=239; b++){
            //TREE TRUNK
            if (array[a/2][b/2]%5==0 && array[a/2][b/2]%2!=0){
              tree.setColor(92,22,22);
              tree.plot(b+x,256-a);
            }
            //BRANCHES
            else if (array[a/2][b/2]%7==0 && array[a/2][b/2]%2!=0){
              int g = (int)(Math.random()*255);
              tree.setColor(92,22,22);
              tree.plot(b+x,256-a);
            }
          }
        }
      }
    }


    //Lines Between the three Trees
    tree.setColor(0,0,0);
    tree.drawLine(0,256,600,256);
    tree.drawLine(0,512,600,512);



  }
}
