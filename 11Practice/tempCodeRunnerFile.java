    void remDuplElem(int arr[])
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            for(int j=i+1; j<=arr.length-1; j++)
            {
                if(arr[i] == arr[j])
                {
                    i++;
                }
                else
                {
                    System.out.println(arr[i]);
                    i++;
                }
            }
        } 
    }
    void remDupl(int arr[])
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            for(int j=i+1; j<=arr.length-1; j++)
            {
                if(arr[i]!=arr[j])
                {
                    System.out.println(arr[i]);
                    i=j;
                }
            }
        }
    }