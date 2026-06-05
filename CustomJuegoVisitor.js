import JuegoVisitor from "./generated/JuegoVisitor.js";

export default class CustomJuegoVisitor extends JuegoVisitor {

    visitJuego(ctx) {
        console.log("\n=== Ejecutando juego ===");
        return this.visitChildren(ctx);
    }

    visitEscena(ctx) {
        const nombre = ctx.ID().getText();
        console.log(`\nEscena: ${nombre}`);
        return this.visitChildren(ctx);
    }

    visitImprimir(ctx) {
        const texto = ctx.STRING().getText();
        console.log(texto.replace(/"/g, ''));
        return null;
    }
}