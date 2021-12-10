package erkan_karatas;

public interface MapInterface {
    // Creates / Allocates a map of given size.
    void SetSize(Dimension dim);

    /**
     * Soruda parametre olarak Dimension alacağı ve return değeri olmadığı açıklanmış.
     * Bunun yerine;
     * Herhangi bir parametre almaksızın oluşturulan haritanın boyutlarını Dimesion olarak dönmesi mümkün olabilir.
     *
     */
    // Get dimensions of given map.
    void GetSize(Dimension dim);
    // Sets border at given point.
    void SetBorder(int x, int y) throws Exception;
    // Clears border at given point.
    void ClearBorder(int x, int y) throws Exception;
    // Checks if given point is border.
    boolean IsBorder(int x, int y) throws Exception;
    // Show map contents.
    void Show();
}
