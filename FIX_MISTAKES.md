***

# 🛠️ Team Debugging & Code Fix Guide: Halloween Mad Libs

This document explains the runtime crash we encountered, how to fix each class file, and provides the corrected code to ensure our project meets all AP CSA / PLTW project guidelines.

---

## 🚨 1. What Caused the Crash? (`java.util.NoSuchElementException`)

When running `runner.java`, the program crashed after the first set of inputs with:
`Exception in thread "main" java.util.NoSuchElementException: No line found`

### **The Three Core Bugs Identified:**
1. **Closing `Scanner` Closes `System.in` Permanently:** 
   Calling `scanner.close()` or `sc.close()` inside individual helper classes (`Sharma_MadLibs.java`, `Anand_MadLibs.java`, `Keerti_MadLibs.java`) permanently shuts down standard input (`System.in`) for the entire Java program. When the next class calls `sc.nextLine()`, Java finds no open input stream and crashes.
2. **Void Methods vs. Return Values:** 
   All helper methods were defined as `public static void print()`. The inputs entered by the user were stored in local variables that disappeared as soon as the method ended. As a result, the story still displayed raw brackets like `[spookyAdjective]` instead of replacing them with user words.
3. **Scanner Newline Buffer Issues:** 
   When reading primitive numbers using `nextInt()` or `nextDouble()`, the Scanner leaves a trailing newline character (`\n`) in the input buffer. Calling `nextLine()` immediately afterward reads that blank line instead of waiting for user input.

---

## 🛠️ 2. Key Rules for Everyone's Code

* **Do NOT call `.close()` inside helper classes.** Only `runner.java` should close the `Scanner` at the very end of `main`.
* **Accept `Scanner` as a parameter:** Pass the `Scanner` object from `runner.java` into each helper method (`getPartX(Scanner sc)`).
* **Return a `String`:** Change method signatures from `public static void` to `public static String` so each class returns its completed story segment.
* **Match Class Header to File Name:** Ensure class headers strictly match the exact file name (e.g., `public class Sharma_MadLibs`).
* **Use camelCase Naming & Comments:** Use proper **camelCase** for variable names and include inline comments explaining algorithm logic.
* **Clear Newline Buffers:** If your code uses `nextInt()` or `nextDouble()`, call `sc.nextLine();` immediately on the next line to clear the input buffer.

---

## 💻 3. Corrected Source Code Files

### 📄 `runner.java` (Team Lead)
```java
import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        // Instantiate a single shared Scanner for the entire program execution
        Scanner sc = new Scanner(System.in);

        // Sequentially collect story parts from each team member's method
        String part1 = Sharma_MadLibs.getPart1(sc);
        String part2 = Arora_MadLibs.getPart2(sc);
        String part3 = Anand_MadLibs.getPart3(sc);
        String part4 = Keerti_MadLibs.getPart4(sc);

        // Output completed Mad Lib story
        System.out.println("\n--- YOUR COMPLETED HALLOWEEN STORY ---");
        System.out.println(part1 + " " + part2 + " " + part3 + " " + part4);

        sc.close(); // Close Scanner once at the very end of main
    }
}
```

---

### 📄 `Sharma_MadLibs.java` (Kaashvi Sharma)
```java
import java.util.Scanner;

public class Sharma_MadLibs {

    // Method accepts shared Scanner and returns constructed String segment
    public static String getPart1(Scanner scanner) {

        // Prompt user and capture spooky adjective using camelCase
        System.out.print("Enter a spooky adjective: ");
        String spookyAdjective = scanner.nextLine();

        // Prompt user and capture monster name using camelCase
        System.out.print("Enter a monster name: ");
        String monsterName = scanner.nextLine();

        // Return concatenated story section (NO scanner.close() call!)
        return "On a spooky Halloween night, a " + spookyAdjective + " " + monsterName + " lurked in the dark.";
    }
}
```

---

### 📄 `Arora_MadLibs.java` (Jiya Arora)
```java
import java.util.Scanner;

public class Arora_MadLibs {

    // Method accepts shared Scanner and returns constructed String segment
    public static String getPart2(Scanner sc) {

        // Prompt user for haunted location
        System.out.print("Enter a location: ");
        String hauntedPlace = sc.nextLine();

        // Prompt user for integer ghost count
        System.out.print("Enter an integer number of ghosts: ");
        int ghostCount = sc.nextInt();
        sc.nextLine(); // Clear leftover newline character from buffer

        // Return concatenated story section incorporating int primitive
        return "Near the abandoned " + hauntedPlace + ", " + ghostCount + " ghosts suddenly emerged from the fog!";
    }
}
```

---

### 📄 `Anand_MadLibs.java` (Nihtahli Anand)
```java
import java.util.Scanner;

public class Anand_MadLibs {

    // Method accepts shared Scanner and returns constructed String segment
    public static String getPart3(Scanner sc) {

        // Prompt user for spooky action verb
        System.out.print("Enter a spooky action verb (past tense): ");
        String spookyVerb = sc.nextLine();

        // Prompt user for double precision decimal candy cost
        System.out.print("Enter a decimal candy cost: ");
        double candyCost = sc.nextDouble();
        sc.nextLine(); // Clear leftover newline character from buffer

        // Return concatenated story section incorporating double primitive
        return "They " + spookyVerb + " loudly while demanding $" + candyCost + " worth of treats.";
    }
}
```

---

### 📄 `Keerti_MadLibs.java` (Pranika Keerti)
```java
import java.util.Scanner;

public class Keerti_MadLibs {

    // Method accepts shared Scanner and returns constructed String segment
    public static String getPart4(Scanner input) {

        // Prompt user for candy type using camelCase variable
        System.out.print("Enter a type of candy: ");
        String favoriteCandy = input.nextLine();

        // Prompt user for magical object using camelCase variable
        System.out.print("Enter a magical object: ");
        String magicalItem = input.nextLine();

        // Return final story resolution section (NO input.close() call!)
        return "We quickly threw a handful of " + favoriteCandy + " into a glowing " + magicalItem + " to escape!";
    }
}
```

---

## 📋 4. Final Submission Checklist

- [x] Class header in each file strictly matches the `.java` file name.
- [x] All user input variables use proper `camelCase` naming conventions.
- [x] Code includes inline comments explaining algorithm logic and program purpose.
- [x] Code tested incrementally to verify that new additions do not break existing modules.
- [x] High-quality, non-mobile terminal screenshot taken for `README.md` submission.
```
