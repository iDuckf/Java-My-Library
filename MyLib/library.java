package MyLib;

public class library {
    //String Array Append
    public String[] strAppend(String[] arr, String s) {
        String[] newArr = new String[arr.length+1];

        for (int i = 0; i < newArr.length; i++) {
            if (i+1 == newArr.length) {
                newArr[i] = s;
            } else {
                newArr[i] = arr[i];
            }
        }

        return newArr;
    }

    //Integer Array Append
    public int[] intAppend(int[] arr, int n) {
        int[] newArr = new int[arr.length+1];

        for (int i = 0; i < newArr.length; i++) {
            if (i+1 == newArr.length) {
                newArr[i] = n;
            } else {
                newArr[i] = arr[i];
            }
        }

        return newArr;
    }

    //Float Array Append
    public float[] floatAppend(float[] arr, float n) {
        float[] newArr = new float[arr.length+1];

        for (int i = 0; i < newArr.length; i++) {
            if (i+1 == newArr.length) {
                newArr[i] = n;
            } else {
                newArr[i] = arr[i];
            }
        }

        return newArr;
    }

    //Char Array Append
    public char[] charAppend(char[] arr, char n) {
        char[] newArr = new char[arr.length+1];

        for (int i = 0; i < newArr.length; i++) {
            if (i+1 == newArr.length) {
                newArr[i] = n;
            } else {
                newArr[i] = arr[i];
            }
        }

        return newArr;
    }

    //Count Items In String Array
    public int strCount(String[] arr, String s) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                count++;
                continue;
            } else {
                continue;
            }
        }

        return count;
    }

    //Count Items In Integer Array
    public int intCount(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
                continue;
            } else {
                continue;
            }
        }

        return count;
    }

    //Count Items In Float Array
    public int floatCount(float[] arr, float n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
                continue;
            } else {
                continue;
            }
        }

        return count;
    }

    //Count Items In Char Array
    public int charCount(char[] arr, char n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
                continue;
            } else {
                continue;
            }
        }

        return count;
    }

    //The Initial Index Of The Searched Item In The String Array
    public int strIndex(String[] arr, String s) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                idx = i;
                break;
            } else {
                continue;
            }
        }

        return idx;
    }

    //The Initial Index Of The Searched Item In The Integer Array
    public int intIndex(int[] arr, int s) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                idx = i;
                break;
            } else {
                continue;
            }
        }

        return idx;
    }

    //The Initial Index Of The Searched Item In The Float Array
    public int floatIndex(float[] arr, float s) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                idx = i;
                break;
            } else {
                continue;
            }
        }

        return idx;
    }

    //The Initial Index Of The Searched Item In The Char Array
    public int charIndex(char[] arr, char s) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                idx = i;
                break;
            } else {
                continue;
            }
        }

        return idx;
    }

    //Reverse Items In String Array
    public String[] strReverse(String[] arr) {
        String[] newArr = new String[arr.length];
        int idx = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[idx];
            idx--;
        }

        return newArr;
    }

    //Reverse Items In Integer Array
    public int[] intReverse(int[] arr) {
        int[] newArr = new int[arr.length];
        int idx = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[idx];
            idx--;
        }

        return newArr;
    }

    //Reverse Items In Float Array
    public float[] floatReverse(float[] arr) {
        float[] newArr = new float[arr.length];
        int idx = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[idx];
            idx--;
        }

        return newArr;
    }

    //Reverse Items In Char Array
    public char[] charReverse(char[] arr) {
        char[] newArr = new char[arr.length];
        int idx = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[idx];
            idx--;
        }

        return newArr;
    }

    //Copy String Array
    public String[] strCopy(String[] arr) {
        String[] newArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    //Copy Integer Array
    public int[] intCopy(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    //Copy Float Array
    public float[] floatCopy(float[] arr) {
        float[] newArr = new float[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    //Copy Char Array
    public char[] charCopy(char[] arr) {
        char[] newArr = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    //Remove Items From String Array
    public String[] strRemove(String[] arr, String s) {
        int newSize = 0;
        for (String element : arr) {
            if (!element.equals(s)) {
                newSize++;
            }
        }

        String[] newArr = new String[newSize];
        int newIndex = 0;

        for (String element : arr) {
            if (!element.equals(s)) {
                newArr[newIndex] = element;
                newIndex++;
            }
        }

        return newArr;
    }

    //Remove Items From Integer Array
    public int[] intRemove(int[] arr, int s) {
        int newSize = 0;
        for (int element : arr) {
            if (element != s) {
                newSize++;
            }
        }

        int[] newArr = new int[newSize];
        int newIndex = 0;

        for (int element : arr) {
            if (element != s) {
                newArr[newIndex] = element;
                newIndex++;
            }
        }

        return newArr;
    }

    //Remove Items From Float Array
    public float[] floatRemove(float[] arr, float s) {
        int newSize = 0;
        for (float element : arr) {
            if (element != s) {
                newSize++;
            }
        }

        float[] newArr = new float[newSize];
        int newIndex = 0;

        for (float element : arr) {
            if (element != s) {
                newArr[newIndex] = element;
                newIndex++;
            }
        }

        return newArr;
    }

    //Remove Items From Char Array
    public char[] charRemove(char[] arr, char s) {
        int newSize = 0;
        for (char element : arr) {
            if (element != s) {
                newSize++;
            }
        }

        char[] newArr = new char[newSize];
        int newIndex = 0;

        for (char element : arr) {
            if (element != s) {
                newArr[newIndex] = element;
                newIndex++;
            }
        }

        return newArr;
    }

    //Insert Item To String Array With Specific Index
    public String[] strInsert(String[] arr, int index, String s) {
        String[] newArr = new String[arr.length+1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = s;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        return newArr;
    }

    //Insert Item To Integer Array With Specific Index
    public int[] intInsert(int[] arr, int index, int n) {
        int[] newArr = new int[arr.length+1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = n;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        return newArr;
    }

    //Insert Item To Float Array With Specific Index
    public float[] floatInsert(float[] arr, int index, float n) {
        float[] newArr = new float[arr.length+1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = n;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        return newArr;
    }

    //Insert Item To Char Array With Specific Index
    public char[] charInsert(char[] arr, int index, char n) {
        char[] newArr = new char[arr.length+1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = n;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        return newArr;
    }

    //Pop Last Item From String Array
    public String strPop(String[] arr) {
        int lastIndex = arr.length-1;

        return arr[lastIndex];
    }

    //Pop Last Item From Integer Array
    public int intPop(int[] arr) {
        int lastIndex = arr.length-1;

        return arr[lastIndex];
    }

    //Pop Last Item From Float Array
    public float floatPop(float[] arr) {
        int lastIndex = arr.length-1;

        return arr[lastIndex];
    }

    //Pop Last Item From Char Array
    public char charPop(char[] arr) {
        int lastIndex = arr.length-1;

        return arr[lastIndex];
    }

    //Pop Specific index From String Array
    public String strPop(String[] arr, int index) {
        int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                newIndex = i;
                break;
            }
        }

        return arr[newIndex];
    }

    //Pop Specific index From Integer Array
    public int intPop(int[] arr, int index) {
        int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                newIndex = i;
                break;
            }
        }

        return arr[newIndex];
    }

    //Pop Specific index From Float Array
    public float floatPop(float[] arr, int index) {
        int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                newIndex = i;
                break;
            }
        }

        return arr[newIndex];
    }

    //Pop Specific index From Char Array
    public char charPop(char[] arr, int index) {
        int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                newIndex = i;
                break;
            }
        }

        return arr[newIndex];
    }
}
