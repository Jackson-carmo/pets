export const TextService = {
    limitarTexto(text: String, tamanhoMaximo: number): String {
        if (text.length < tamanhoMaximo) {
            return text;
        }
        return text.slice(0, tamanhoMaximo) + '...';
    }
}