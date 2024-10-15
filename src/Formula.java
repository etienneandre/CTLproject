/**
 * Quick CTL parser
 * Author       : Étienne André
 * Created      : 2024/10/08
 * Last modified: 2024/10/15
 */

// Abstract class representing any CTL formula
public abstract class Formula {
    public abstract String toString();
}

// Atomic proposition (e.g., p, q, etc.)
class AtomicProposition extends Formula {
    private String name;

    public AtomicProposition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

//------------------------------------------------------------
// TRUE / FALSE constants
//------------------------------------------------------------
class TrueFormula extends Formula {
    @Override
    public String toString() {
        return "TRUE";
    }
}

// Represents the FALSE constant
class FalseFormula extends Formula {
    @Override
    public String toString() {
        return "FALSE";
    }
}


//------------------------------------------------------------
// Logical operators (AND, OR, IMPLIES)
//------------------------------------------------------------
// Negation (NOT)
class NotFormula extends Formula {
    private Formula formula;

    public NotFormula(Formula formula) {
        this.formula = formula;
    }

    public Formula getFormula() {
        return formula;
    }

    @Override
    public String toString() {
        return "NOT " + formula;
    }
}

class AndFormula extends Formula {
    private Formula left, right;

    public AndFormula(Formula left, Formula right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " AND " + right + ")";
    }
}

class OrFormula extends Formula {
    private Formula left, right;

    public OrFormula(Formula left, Formula right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " OR " + right + ")";
    }
}

class ImpliesFormula extends Formula {
    private Formula left, right;

    public ImpliesFormula(Formula left, Formula right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " => " + right + ")";
    }
}

//------------------------------------------------------------
// Temporal operators (EX, AX, EF, etc.)
//------------------------------------------------------------
class EFFormula extends Formula {
    private Formula formula;

    public EFFormula(Formula formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "EF " + formula;
    }
}

class EGFormula extends Formula {
    private Formula formula;

    public EGFormula(Formula formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "EG " + formula;
    }
}

class EUFormula extends Formula {
    private Formula phi, psi;

    public EUFormula(Formula phi, Formula psi) {
        this.phi = phi;
        this.psi = psi;
    }

    @Override
    public String toString() {
        return "E (" + phi + ") U (" + psi + ")";
    }
}

class EXFormula extends Formula {
    private Formula formula;

    public EXFormula(Formula formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "EX " + formula;
    }
}

class AFFormula extends Formula {
    private Formula formula;

    public AFFormula(Formula formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "AF " + formula;
    }
}


class AGFormula extends Formula {
    private Formula formula;

    public AGFormula(Formula formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "AG " + formula;
    }
}

class AUFormula extends Formula {
    private Formula phi, psi;

    public AUFormula(Formula phi, Formula psi) {
        this.phi = phi;
        this.psi = psi;
    }

    @Override
    public String toString() {
        return "A (" + phi + ") U (" + psi + ")";
    }
}

class AXFormula extends Formula {
    private Formula formula;

    public AXFormula(Formula formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "AX " + formula;
    }
}

