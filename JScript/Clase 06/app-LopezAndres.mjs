import express from "express";
import morgan from "morgan";
import tareasRoutes from "./router/tareas.routes.mjs"
import authRoutes from "./router/auth.routes.mjs"

const app = express();
//Middlewares
app.use(morgan("dev"));
app.use(express.json());
app.use(express.urlencoded({extended:false}));

app.get("/", (req, res) => res.json({message: "Proyecto PERN"}));
app.use('/api',tareasRoutes);
app.use('/api',authRoutes);

//Controlador de errores
app.use((err,req,res,next) =>{
    res.status(500).json({
        status: "error",
        message: err.message
    })
});

//Exportamos la constante app.
export default app;