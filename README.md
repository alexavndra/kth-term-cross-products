## README.md

This is the README.md for the CrossProduct program; done for a coding assignment that was unfinished.

## Intention of program, classes, main methods, and variables

As mentioned, the CrossProduct program was an unfinished coding assignment. As stated throughout the code, the intention of the program is to return (print out) the kth term of the CrossProduct array, which is sorted by smallest to greatest cross product. 

All the code can be found under App.java, located in the src folder. The compiled output files will be generated in the `bin` folder by default.

### Classes, main methods and variables
- `CrossProductElements`: object class that creates individual cross products from a given array
- `CrossProductSort`: Interface class that compares the cross products of two CrossProductElements
- `cpArr`: ArrayList made up of the CrossProductElements objects
- `Collections.sort(cpArr, new CrossProductSort()`: Collections.sort method that sorts `cpArr` by the cross products (smallest to biggest cross products)
- `k`: int that determines what element to return from `cpArr`

> 2023 Alexandra Hernandez
