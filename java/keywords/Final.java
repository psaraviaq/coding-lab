package keywords;

public class Final {
    //* "final" is used in three different contexts:
    
    //* 1. To declare a constant (the name is usually in uppercase and words are separated by underscores)
    //! Final fields must be initialized, either when declared or in the constructor
    final double E = 2.7182818284590452353602874713527;
    final double PI;
    
    public Final() {
        PI = 3.1415926535897932384626433832795;
    }
    
    //* 2. To declare a class as not being able to be extended
    final class FinalClass {
    }
    
    //* 3. To declare a method as not being able to be overridden
    final void finalMethod() {
    }
    
    public static void main(String[] args) {
        //! 1. Constants can't be changed
        // E = 3;
        
        //! 2. Final classes can't be extended
        // class FinalFinalClass extends FinalClass {}
        
        //! 3. Final methods can't be overridden
        class FinalClass extends Final {
            // void finalMethod() {}
        }
    }
}
