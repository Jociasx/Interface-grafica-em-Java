public class App {
    public void display(GLAutoDrawable drawable)
    {
        
        gl.glColor3f(0.0f, 0.0f, 1.0f); // azul
        gl.glBegin(GL.GL_TRIANGLE_FAN);
            gl.glVertex2f( 0, 0); // primeiro ponto, comum a todos
            gl.glVertex2f(-4,-5);
            gl.glVertex2f(-6,-3);
            gl.glVertex2f(-8, 0);
            gl.glVertex2f(-6, 3);
            gl.glVertex2f(-4, 5);
            gl.glVertex2f( 4, 5);
            gl.glVertex2f( 6, 3);
            gl.glVertex2f( 8, 0);
            gl.glVertex2f( 6,-3);
            gl.glVertex2f( 4,-5);
        gl.glEnd();
}
