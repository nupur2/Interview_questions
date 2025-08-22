# Interview_questions

TestAh, got it 🙂 — you want to ask tricky/confusing interview questions about immutability so you can test how deeply someone actually understands it (instead of just repeating the textbook definition).

Here are some good ways you can throw “consent” (curveballs) at them:

⸻

🔹 Confusing / Tricky Questions on Immutability
	1.	String Immutability in Java
	•	“If Strings are immutable, how does concat() or replace() work? Do they modify the original object?”
(Expected: They return a new String, the old one stays unchanged.)
	2.	Custom Immutable Classes
	•	“If I make all fields final, does that make my class immutable?”
(Catch: No — if fields are mutable objects like List, immutability breaks unless you do defensive copies.)
	3.	Collections & Wrappers
	•	“If I use Collections.unmodifiableList(list), is it immutable?”
(Catch: It’s only unmodifiable, but underlying list can still change.)
	4.	Escaping References
	•	“If your immutable class has a Date field, and you return it in a getter, is your class still immutable?”
(Catch: No, because caller can modify Date. Need to return a copy.)
	5.	Final Keyword Misconception
	•	“If a reference variable is final, does it mean the object is immutable?”
(Catch: No, it only means the reference cannot point to another object, but the object itself can change.)
	6.	Thread Safety Confusion
	•	“Why do people say immutability makes objects thread-safe? Can an immutable object ever cause concurrency issues?”
(Expected: Immutable objects are inherently thread-safe, but you could still have concurrency issues if you rely on multiple objects’ states together.)
	7.	Performance Trade-off
	•	“If immutability is so great, why don’t we make everything immutable?”
(Catch: Too many new objects → memory and GC overhead.)
	8.	Hidden Mutability
	•	“Suppose you mark your class as immutable, but internally you cache computed results in a Map. Is it still immutable?”
(Catch: If that cache is mutable and exposed, no. Unless it’s carefully handled as transient or volatile and hidden.)

⸻

🔹 Quick “Trap” Coding Example

You can give them this and ask if it’s immutable:
public final class Person {
    private final String name;
    private final List<String> hobbies;

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}

