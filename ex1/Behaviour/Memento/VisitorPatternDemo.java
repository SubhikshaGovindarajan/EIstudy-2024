// Element Interface
interface Document {
    void accept(Visitor visitor);
}

// Concrete Elements
class TextDocument implements Document {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print() {
        System.out.println("Printing Text Document");
    }

    public void save() {
        System.out.println("Saving Text Document");
    }

    public void export() {
        System.out.println("Exporting Text Document");
    }
}

class Spreadsheet implements Document {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print() {
        System.out.println("Printing Spreadsheet");
    }

    public void save() {
        System.out.println("Saving Spreadsheet");
    }

    public void export() {
        System.out.println("Exporting Spreadsheet");
    }
}

class Presentation implements Document {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print() {
        System.out.println("Printing Presentation");
    }

    public void save() {
        System.out.println("Saving Presentation");
    }

    public void export() {
        System.out.println("Exporting Presentation");
    }
}

// Visitor Interface
interface Visitor {
    void visit(TextDocument textDocument);
    void visit(Spreadsheet spreadsheet);
    void visit(Presentation presentation);
}

// Concrete Visitors
class PrintVisitor implements Visitor {
    @Override
    public void visit(TextDocument textDocument) {
        textDocument.print();
    }

    @Override
    public void visit(Spreadsheet spreadsheet) {
        spreadsheet.print();
    }

    @Override
    public void visit(Presentation presentation) {
        presentation.print();
    }
}

class SaveVisitor implements Visitor {
    @Override
    public void visit(TextDocument textDocument) {
        textDocument.save();
    }

    @Override
    public void visit(Spreadsheet spreadsheet) {
        spreadsheet.save();
    }

    @Override
    public void visit(Presentation presentation) {
        presentation.save();
    }
}

class ExportVisitor implements Visitor {
    @Override
    public void visit(TextDocument textDocument) {
        textDocument.export();
    }

    @Override
    public void visit(Spreadsheet spreadsheet) {
        spreadsheet.export();
    }

    @Override
    public void visit(Presentation presentation) {
        presentation.export();
    }
}

// Main Class
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Document textDoc = new TextDocument();
        Document spreadsheet = new Spreadsheet();
        Document presentation = new Presentation();

        Visitor printVisitor = new PrintVisitor();
        Visitor saveVisitor = new SaveVisitor();
        Visitor exportVisitor = new ExportVisitor();

        System.out.println("Printing documents:");
        textDoc.accept(printVisitor);
        spreadsheet.accept(printVisitor);
        presentation.accept(printVisitor);

        System.out.println("\nSaving documents:");
        textDoc.accept(saveVisitor);
        spreadsheet.accept(saveVisitor);
        presentation.accept(saveVisitor);

        System.out.println("\nExporting documents:");
        textDoc.accept(exportVisitor);
        spreadsheet.accept(exportVisitor);
        presentation.accept(exportVisitor);
    }
}
