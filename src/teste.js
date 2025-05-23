// Define a tag que você deseja adicionar
const tagToAdd = "#entrada";

// Chama o modal de criação de tarefas do plugin Obsidian Tasks
let taskLine = await this.app.plugins.plugins['obsidian-tasks-plugin'].apiV1.createTaskLineModal();

// Verifica se uma tarefa foi criada (o usuário não cancelou o modal)
if (taskLine) {
    // Expressões regulares para detectar os formatos de data do Tasks plugin:
    // 📅 YYYY-MM-DD (Due Date)
    // 🛫 YYYY-MM-DD (Start Date)
    // ⏳ YYYY-MM-DD (Scheduled Date)
    // O '\s*' permite zero ou mais espaços entre o emoji e a data
    const hasDueDate = /📅\s*\d{4}-\d{2}-\d{2}/.test(taskLine);
    const hasStartDate = /🛫\s*\d{4}-\d{2}-\d{2}/.test(taskLine);
    const hasScheduledDate = /⏳\s*\d{4}-\d{2}-\d{2}/.test(taskLine);

    
    // Se NENHUMA das datas (Due, Start ou Scheduled) foi encontrada, adiciona a tag
    if (!hasDueDate && !hasStartDate && !hasScheduledDate) {
        taskLine += ` ${tagToAdd}`;
    } else {
        // Se ALGUMA das datas foi encontrada, não faz nada (não adiciona a tag)
        // A linha da tarefa permanece como foi digitada no modal.
    }
}


console.log(/🛫\s*\d{4}-\d{2}-\d{2}/.typeOf());
console.log(hasDueDate.typeOf());