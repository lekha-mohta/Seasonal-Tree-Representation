# Seasonal Forest Visualization

This Java program generates a graphical representation of a forest during three different seasons: summer, autumn, and winter. Each version of the forest is displayed in a separate section of the graphics window with distinct seasonal characteristics.

## Features

- **Summer Forest**:
  - Green leaves with slight variations in color.
  - Trees randomly positioned in the scene.
- **Autumn Forest**:
  - Leaves turn brown with color variations to mimic autumn foliage.
- **Winter Forest**:
  - Trees lose their leaves, leaving only branches.
  - Ground is randomly patterned with green (grass) and brown (barren land).

## Tools and Libraries

- **Java**:
  - Core programming language.
- **Sheffield Package**:
  - Utilized for file reading (`EasyReader`) and graphical rendering (`EasyGraphics`).

## File Details

- **Main Program**: `Assignment2.java`
- **Data File**: `tree.txt` (contains encoded data for rendering trees).

## How It Works

1. **Input File Parsing**:
   - Reads the encrypted `tree.txt` file containing uppercase characters.
   - Decodes the characters to classify tree components (trunk, leaves, background).

2. **Array Usage**:
   - Data from the file is stored in a 2D array for efficient tree rendering.

3. **Randomization**:
   - Trees are randomly positioned within predefined sections of the scene.
   - Leaf colors and ground patterns are randomized for realism.

4. **Seasonal Rendering**:
   - Each season has a unique rendering logic, varying the colors and appearance of the trees and ground.

5. **Graphical Output**:
   - Utilizes `EasyGraphics` to render trees and backgrounds in a 600x768 pixel window.

## How to Run

1. Place `Assignment2.java` and `tree.txt` in the same directory.
2. Compile the program:
   ```bash
   javac Assignment2.java
