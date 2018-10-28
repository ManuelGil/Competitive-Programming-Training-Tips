

void peneira(int p,int m,int *v)
{
    int f=2*p;
    int x=v[p];
    while(f<=m)
    {
        if(f<m&&v[f]<v[f+1])
            ++f;
        if(x>=v[f])
            break;
        v[p]=v[f];
        p=f;
        f=2*p;
    }
    v[p]=x;
}
void heapsort(int n,int *v)
{
    int p,m;
    int x;
    for (p=n/2; p>=1; --p)
    {
        peneira(p,n,v);
    }
    for (m=n; m>=2; --m)
    {
        x=v[1];
        v[1]=v[m];
        v[m]=x;
        peneira(1,m-1,v);
    }
}